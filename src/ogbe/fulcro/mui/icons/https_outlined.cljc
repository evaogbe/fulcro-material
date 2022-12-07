(ns ogbe.fulcro.mui.icons.https-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HttpsOutlined" :default HttpsOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-https-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpsOutlined)))