(ns ogbe.fulcro.mui.icons.surround-sound
  #?(:cljs (:require
            ["@mui/icons-material/SurroundSound" :default SurroundSound]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-surround-sound
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SurroundSound)))