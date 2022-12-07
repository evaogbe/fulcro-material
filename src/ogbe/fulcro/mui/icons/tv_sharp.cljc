(ns ogbe.fulcro.mui.icons.tv-sharp
  #?(:cljs (:require
            ["@mui/icons-material/TvSharp" :default TvSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-tv-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory TvSharp)))