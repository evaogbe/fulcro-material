(ns ogbe.fulcro.mui.icons.https-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HttpsRounded" :default HttpsRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-https-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpsRounded)))