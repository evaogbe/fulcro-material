(ns ogbe.fulcro.mui.icons.toggle-off-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOffRounded" :default ToggleOffRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-off-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOffRounded)))