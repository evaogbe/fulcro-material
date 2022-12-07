(ns ogbe.fulcro.mui.icons.keyboard-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardTwoTone" :default KeyboardTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardTwoTone)))