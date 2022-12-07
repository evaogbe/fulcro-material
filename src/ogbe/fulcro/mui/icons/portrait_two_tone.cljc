(ns ogbe.fulcro.mui.icons.portrait-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/PortraitTwoTone" :default PortraitTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-portrait-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory PortraitTwoTone)))