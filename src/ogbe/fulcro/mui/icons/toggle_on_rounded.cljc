(ns ogbe.fulcro.mui.icons.toggle-on-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOnRounded" :default ToggleOnRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-on-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOnRounded)))