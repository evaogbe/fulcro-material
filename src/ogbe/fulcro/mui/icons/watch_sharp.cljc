(ns ogbe.fulcro.mui.icons.watch-sharp
  #?(:cljs (:require
            ["@mui/icons-material/WatchSharp" :default WatchSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-watch-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory WatchSharp)))