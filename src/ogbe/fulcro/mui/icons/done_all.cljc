(ns ogbe.fulcro.mui.icons.done-all
  #?(:cljs (:require
            ["@mui/icons-material/DoneAll" :default DoneAll]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-all
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneAll)))