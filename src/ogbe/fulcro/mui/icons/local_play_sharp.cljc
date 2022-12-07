(ns ogbe.fulcro.mui.icons.local-play-sharp
  #?(:cljs (:require
            ["@mui/icons-material/LocalPlaySharp" :default LocalPlaySharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-play-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalPlaySharp)))