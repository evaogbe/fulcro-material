(ns ogbe.fulcro.mui.icons.toggle-on
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOn" :default ToggleOn]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-on
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOn)))