(ns ogbe.fulcro.mui.icons.toggle-on-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/ToggleOnTwoTone" :default ToggleOnTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-toggle-on-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ToggleOnTwoTone)))