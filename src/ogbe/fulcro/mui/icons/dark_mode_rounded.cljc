(ns ogbe.fulcro.mui.icons.dark-mode-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DarkModeRounded" :default DarkModeRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dark-mode-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DarkModeRounded)))