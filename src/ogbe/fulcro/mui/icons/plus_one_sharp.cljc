(ns ogbe.fulcro.mui.icons.plus-one-sharp
  #?(:cljs (:require
            ["@mui/icons-material/PlusOneSharp" :default PlusOneSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-plus-one-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PlusOneSharp)))