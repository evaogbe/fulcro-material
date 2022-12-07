(ns ogbe.fulcro.mui.icons.tv-off
  #?(:cljs (:require
            ["@mui/icons-material/TvOff" :default TvOff]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tv-off
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TvOff)))