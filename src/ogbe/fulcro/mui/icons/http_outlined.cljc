(ns ogbe.fulcro.mui.icons.http-outlined
  #?(:cljs (:require
            ["@mui/icons-material/HttpOutlined" :default HttpOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-http-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpOutlined)))