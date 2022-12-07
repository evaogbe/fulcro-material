(ns ogbe.fulcro.mui.icons.auto-delete-sharp
  #?(:cljs (:require
            ["@mui/icons-material/AutoDeleteSharp" :default AutoDeleteSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-auto-delete-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AutoDeleteSharp)))