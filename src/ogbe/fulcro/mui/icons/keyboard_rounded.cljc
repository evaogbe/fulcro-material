(ns ogbe.fulcro.mui.icons.keyboard-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardRounded" :default KeyboardRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardRounded)))