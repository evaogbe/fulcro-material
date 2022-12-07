(ns ogbe.fulcro.mui.icons.error-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ErrorTwoTone" :default ErrorTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-error-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ErrorTwoTone)))