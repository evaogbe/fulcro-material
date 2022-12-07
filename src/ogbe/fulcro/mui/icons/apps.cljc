(ns ogbe.fulcro.mui.icons.apps
  #?(:cljs (:require
            ["@mui/icons-material/Apps" :default Apps]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-apps
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Apps)))