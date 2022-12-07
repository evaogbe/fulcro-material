(ns ogbe.fulcro.mui.icons.camera-two-tone
  #?(:cljs (:require
            ["@mui/icons-material/CameraTwoTone" :default CameraTwoTone]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-camera-two-tone
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory CameraTwoTone)))