(ns ogbe.fulcro.mui.icons.keyboard-tab-sharp
  #?(:cljs (:require
            ["@mui/icons-material/KeyboardTabSharp" :default KeyboardTabSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-keyboard-tab-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory KeyboardTabSharp)))