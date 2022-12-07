(ns ogbe.fulcro.mui.icons.done-all-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DoneAllSharp" :default DoneAllSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-all-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneAllSharp)))