(ns ogbe.fulcro.mui.icons.error-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ErrorRounded" :default ErrorRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ErrorRounded)))