(ns ogbe.fulcro.mui.icons.error-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ErrorSharp" :default ErrorSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ErrorSharp)))