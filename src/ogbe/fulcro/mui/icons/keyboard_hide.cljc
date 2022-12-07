(ns ogbe.fulcro.mui.icons.keyboard-hide
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardHide" :default KeyboardHide]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-hide
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardHide)))