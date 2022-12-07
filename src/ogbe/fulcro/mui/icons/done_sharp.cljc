(ns ogbe.fulcro.mui.icons.done-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DoneSharp" :default DoneSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneSharp)))