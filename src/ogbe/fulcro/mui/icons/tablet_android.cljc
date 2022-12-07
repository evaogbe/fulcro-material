(ns ogbe.fulcro.mui.icons.tablet-android
  #?(:cljs (:require
            ["@mui/icons-material/TabletAndroid" :default TabletAndroid]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tablet-android
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TabletAndroid)))