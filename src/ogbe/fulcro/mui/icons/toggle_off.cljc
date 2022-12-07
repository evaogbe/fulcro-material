(ns ogbe.fulcro.mui.icons.toggle-off
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOff" :default ToggleOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOff)))