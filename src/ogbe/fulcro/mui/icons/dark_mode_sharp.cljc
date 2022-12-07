(ns ogbe.fulcro.mui.icons.dark-mode-sharp
  #?(:cljs (:require
            ["@mui/icons-material/DarkModeSharp" :default DarkModeSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dark-mode-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DarkModeSharp)))