(ns ogbe.fulcro.mui.icons.deselect-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/DeselectTwoTone" :default DeselectTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-deselect-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DeselectTwoTone)))