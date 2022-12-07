(ns ogbe.fulcro.mui.icons.call-sharp
  #?(:cljs (:require
            ["@mui/icons-material/CallSharp" :default CallSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-call-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CallSharp)))