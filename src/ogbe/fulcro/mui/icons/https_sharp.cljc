(ns ogbe.fulcro.mui.icons.https-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HttpsSharp" :default HttpsSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-https-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpsSharp)))