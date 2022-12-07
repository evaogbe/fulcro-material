(ns ogbe.fulcro.mui.icons.help-outline
  #?(:cljs (:require
            ["@mui/icons-material/HelpOutline" :default HelpOutline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-help-outline
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HelpOutline)))