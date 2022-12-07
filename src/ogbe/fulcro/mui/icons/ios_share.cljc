(ns ogbe.fulcro.mui.icons.ios-share
  #?(:cljs (:require
            ["@mui/icons-material/IosShare" :default IosShare]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-ios-share
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IosShare)))