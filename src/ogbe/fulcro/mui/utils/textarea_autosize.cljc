(ns ogbe.fulcro.mui.utils.textarea-autosize
  #?(:cljs (:require
            ["@mui/base/TextareaAutosize" :default TextareaAutosize]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-textarea-autosize #?(:clj  (fn [& _args])
                             :cljs (interop/react-input-factory TextareaAutosize)))
