(ns ogbe.fulcro.mui.icons.done-outline
  #?(:cljs (:require
            ["@mui/icons-material/DoneOutline" :default DoneOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-done-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DoneOutline)))