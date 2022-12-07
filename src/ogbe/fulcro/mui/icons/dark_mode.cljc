(ns ogbe.fulcro.mui.icons.dark-mode
  #?(:cljs (:require
            ["@mui/icons-material/DarkMode" :default DarkMode]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dark-mode
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DarkMode)))