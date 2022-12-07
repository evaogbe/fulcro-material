(ns ogbe.fulcro.mui.icons.http-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HttpSharp" :default HttpSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-http-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpSharp)))