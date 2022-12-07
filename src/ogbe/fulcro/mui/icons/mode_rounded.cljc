(ns ogbe.fulcro.mui.icons.mode-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ModeRounded" :default ModeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-mode-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ModeRounded)))