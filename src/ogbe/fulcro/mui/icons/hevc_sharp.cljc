(ns ogbe.fulcro.mui.icons.hevc-sharp
  #?(:cljs (:require
            ["@mui/icons-material/HevcSharp" :default HevcSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-hevc-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HevcSharp)))