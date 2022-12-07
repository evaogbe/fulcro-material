(ns ogbe.fulcro.mui.icons.rice-bowl
  #?(:cljs (:require
            ["@mui/icons-material/RiceBowl" :default RiceBowl]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-rice-bowl
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RiceBowl)))