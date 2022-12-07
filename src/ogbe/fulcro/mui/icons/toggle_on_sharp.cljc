(ns ogbe.fulcro.mui.icons.toggle-on-sharp
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOnSharp" :default ToggleOnSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-on-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOnSharp)))