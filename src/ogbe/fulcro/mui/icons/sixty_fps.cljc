(ns ogbe.fulcro.mui.icons.sixty-fps
  #?(:cljs (:require
            ["@mui/icons-material/SixtyFps" :default SixtyFps]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-sixty-fps
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory SixtyFps)))