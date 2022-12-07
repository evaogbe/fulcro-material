(ns ogbe.fulcro.mui.icons.subway-sharp
  #?(:cljs (:require
            ["@mui/icons-material/SubwaySharp" :default SubwaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-subway-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SubwaySharp)))