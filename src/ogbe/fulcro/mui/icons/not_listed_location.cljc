(ns ogbe.fulcro.mui.icons.not-listed-location
  #?(:cljs (:require
            ["@mui/icons-material/NotListedLocation" :default NotListedLocation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-not-listed-location
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotListedLocation)))