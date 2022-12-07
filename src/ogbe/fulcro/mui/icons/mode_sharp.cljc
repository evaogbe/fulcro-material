(ns ogbe.fulcro.mui.icons.mode-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ModeSharp" :default ModeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeSharp)))