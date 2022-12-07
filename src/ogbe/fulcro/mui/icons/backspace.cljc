(ns ogbe.fulcro.mui.icons.backspace
  #?(:cljs (:require
            ["@mui/icons-material/Backspace" :default Backspace]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-backspace
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Backspace)))