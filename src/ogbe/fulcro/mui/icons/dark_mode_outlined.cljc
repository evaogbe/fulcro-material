(ns ogbe.fulcro.mui.icons.dark-mode-outlined
  #?(:cljs (:require
            ["@mui/icons-material/DarkModeOutlined" :default DarkModeOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dark-mode-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DarkModeOutlined)))