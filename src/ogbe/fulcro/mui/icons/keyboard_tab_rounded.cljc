(ns ogbe.fulcro.mui.icons.keyboard-tab-rounded
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardTabRounded" :default KeyboardTabRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-tab-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardTabRounded)))