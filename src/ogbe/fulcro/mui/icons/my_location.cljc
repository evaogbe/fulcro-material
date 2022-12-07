(ns ogbe.fulcro.mui.icons.my-location
  #?(:cljs (:require
            ["@mui/icons-material/MyLocation" :default MyLocation]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-my-location
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory MyLocation)))