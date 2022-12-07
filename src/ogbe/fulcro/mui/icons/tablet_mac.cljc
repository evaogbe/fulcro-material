(ns ogbe.fulcro.mui.icons.tablet-mac
  #?(:cljs (:require
            ["@mui/icons-material/TabletMac" :default TabletMac]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet-mac
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabletMac)))