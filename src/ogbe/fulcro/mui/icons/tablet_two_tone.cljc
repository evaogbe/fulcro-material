(ns ogbe.fulcro.mui.icons.tablet-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/TabletTwoTone" :default TabletTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabletTwoTone)))