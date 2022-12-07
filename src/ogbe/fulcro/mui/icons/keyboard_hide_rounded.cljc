(ns ogbe.fulcro.mui.icons.keyboard-hide-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardHideRounded" :default KeyboardHideRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-hide-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardHideRounded)))